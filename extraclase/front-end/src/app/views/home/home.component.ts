import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit {
  data;
  displayedColumns: string[] = [
    'number',
    'name',
    'lastname',
    'email',
    'phone',
    'career',
  ];
  constructor(private router: Router) {}

  ngOnInit(): void {}
  goTo(place: string) {
    this.router.navigate([`/${place}`]);
  }
}
