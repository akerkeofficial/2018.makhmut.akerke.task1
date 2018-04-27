import {NgModule} from "@angular/core";
import {AppComponent} from "./app.component";
import {LoginComponent} from "./login/login.component";
import {AuthenticatedComponent} from "./authenticated/authenticated.component";
import {BrowserModule} from "@angular/platform-browser";
import {HttpService} from "../provider/HttpService";
import {HttpModule} from "@angular/http";
import {FormsModule} from "@angular/forms";
import { RouterModule, Routes } from "@angular/router";
import {APP_BASE_HREF} from "@angular/common";

const appRoutes:Routes = [
    {

        path: 'home',
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

    providers:[HttpService, {provide: APP_BASE_HREF, useValue: '/home'}],
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