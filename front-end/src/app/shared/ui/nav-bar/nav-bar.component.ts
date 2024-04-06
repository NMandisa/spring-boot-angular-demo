import { Component } from '@angular/core';
import {MatToolbar, MatToolbarRow} from "@angular/material/toolbar";
import {MatIconModule} from '@angular/material/icon';
import {MatAnchor} from "@angular/material/button";
import {RouterLink, RouterOutlet, RouterLinkActive} from "@angular/router";

@Component({
  selector: 'app-nav-bar',
  standalone: true,
  imports: [
    MatToolbar,MatToolbarRow,MatIconModule,
    MatAnchor, RouterLink, RouterOutlet, RouterLinkActive
  ],
  templateUrl: './nav-bar.component.html',
  styleUrl: './nav-bar.component.css'
})
export class NavBarComponent {
}
