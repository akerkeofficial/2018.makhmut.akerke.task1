import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {HttpService} from "../../provider/HttpService";

@Component({
    selector: 'login_app',
    template: require('./login.component.html'),
    styles: [require('./login.component.css')]
})

export class LoginComponent implements OnInit {
    public text:string="sdasd";
    constructor(private router:Router, private httpService:HttpService) { }

    ngOnInit() {

    }

    loginUser(e) {
        e.preventDefault();
        console.log(e);
        var username = e.target.elements[0].value;
        var password = e.target.elements[1].value;
        console.log(username,password);
        this.httpService.post("/login",{username:username, password:password}).toPromise().then(
            result =>{
                console.log(result);
                this.text=result.json().text;
                this.router.navigate([this.text]);
            },
            error =>{
                this.text="Something is wrong";

            }
        )
    }
}
