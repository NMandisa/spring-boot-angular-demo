import { Component } from '@angular/core';
import { RouterOutlet} from '@angular/router';
import { CommonModule } from '@angular/common';
import {MatButtonToggle, MatButtonToggleGroup} from "@angular/material/button-toggle";
import {MatButton} from "@angular/material/button";
import {NavBarComponent} from "./shared/ui/nav-bar/nav-bar.component";



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, MatButtonToggle, MatButtonToggleGroup, MatButton, NavBarComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'spring-boot-angular-basic';
  isApple: boolean = true;
  fruit: string ='Orange';
  fruits: string[] = ['Apple', 'Orange', 'Banana'];
  toggleFruit() {
    this.isApple = !this.isApple;
  }
}
