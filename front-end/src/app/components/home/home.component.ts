import { Component } from '@angular/core';
import {NavBarComponent} from "../../shared/ui/nav-bar/nav-bar.component";
import {HeaderComponent} from "../../shared/ui/header/header.component";
import {SignInComponent} from "../../shared/ui/sign-in/sign-in.component";
import {LeftSideBarComponent} from "../../shared/ui/left-side-bar/left-side-bar.component";
import {RightSideBarComponent} from "../../shared/ui/right-side-bar/right-side-bar.component";
import {RouterOutlet} from "@angular/router";
import {FooterComponent} from "../../shared/ui/footer/footer.component";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    NavBarComponent,
    HeaderComponent,
    SignInComponent,
    LeftSideBarComponent,
    RightSideBarComponent,
    RouterOutlet,
    FooterComponent
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}
