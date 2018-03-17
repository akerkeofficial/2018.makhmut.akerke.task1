import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'login_app',
    template: require('./login.component.html')
})

export class LoginComponent implements OnInit {
    public text:string="sdasd";
    constructor(private router:Router) { }

    ngOnInit() {

    }

    loginUser(e) {
        e.preventDefault();
        console.log(e);
        var username = e.target.elements[0].value;
        var password = e.target.elements[1].value;
        console.log(username,password);

        if (username == 'admin' && password == 'admin123') {
            this.router.navigate(['authenticated']);
        }
        else if (username == 'admin1' && password == 'admin123') {
            this.router.navigate(['authenticated']);
        }
        else if (username == 'admin2' && password == 'admin123') {
            this.router.navigate(['authenticated']);
        }
        else if (username == 'admin3' && password == 'admin123') {
            this.router.navigate(['authenticated']);
        }
        else if (username == 'admin4' && password == 'admin123') {
            this.router.navigate(['authenticated']);
        }
        else     console.log(username+"=fail");

    }
}
