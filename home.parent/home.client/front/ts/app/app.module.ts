import {NgModule} from "@angular/core";
import {AppComponent} from "./app.component";
import {LoginComponent} from "./login/login.component";
import {AuthenticatedComponent} from "./authenticated/authenticated.component";
import {BrowserModule} from "@angular/platform-browser";
import {HttpService} from "../provider/HttpService";
import {HttpModule} from "@angular/http";
import {FormsModule} from "@angular/forms";
import { RouterModule, Routes } from "@angular/router";

const appRoutes:Routes = [
    {

        path: '',
        component: LoginComponent
    },
    {
        path: 'authenticated',
        component: AuthenticatedComponent
    }
]
@NgModule({
    imports:[
        BrowserModule,
        HttpModule,
        RouterModule.forRoot(appRoutes)
    ],
    providers:[HttpService],
    declarations:[
        AppComponent,
        LoginComponent,
        AuthenticatedComponent,
    ],
    bootstrap:[AppComponent],
    entryComponents:[AppComponent]
})
export class AppModule{

}