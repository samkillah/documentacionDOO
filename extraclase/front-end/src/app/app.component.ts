import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'front-end';
  isExpanded = false;
  actions = [
    { icon: 'home', name: 'Inicio', route: '/home' },
    { icon: 'person', name: 'Estudiantes', route: '/students' },
    { icon: 'location_on', name: 'Lugares', route: '/places' },
    { icon: 'school', name: 'Monitores', route: '/teachers' },
  ];
}
