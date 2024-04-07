import { Component } from '@angular/core';
import {NavBarComponent} from "../../shared/ui/nav-bar/nav-bar.component";
import {SignInComponent} from "../../shared/ui/sign-in/sign-in.component";
import {HeaderComponent} from "../../shared/ui/header/header.component";
import {FooterComponent} from "../../shared/ui/footer/footer.component";

@Component({
  selector: 'app-category',
  standalone: true,
  imports: [
    NavBarComponent,
    SignInComponent,
    HeaderComponent,
    FooterComponent
  ],
  templateUrl: './category.component.html',
  styleUrl: './category.component.css'
})
export class CategoryComponent {

}
