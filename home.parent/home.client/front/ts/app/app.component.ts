import {Component, OnInit} from "@angular/core";
import {HttpService} from "../provider/HttpService";
import "rxjs/add/operator/toPromise";


@Component({
    selector:"home_app",
    // template: `{{text}}`

    template: require('./app.component.html'),
    styles: [require('./app.component.css')]
})
export class AppComponent implements OnInit {
    private text:string;

    ngOnInit(): void {
        this.httpService.get("/getMainText").toPromise().then(
            result =>{
                console.log(result);
                this.text=result.json();
            },
    error =>{
    this.text="Something is wrong";

}
        )
    }
    constructor (private httpService:HttpService){
    }
}