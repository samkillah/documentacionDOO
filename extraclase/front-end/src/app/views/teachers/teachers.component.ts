import { Component, OnInit } from '@angular/core';
import { MonitorDTO, MonitorService } from 'src/app/services/monitor.service';

@Component({
  selector: 'app-teachers',
  templateUrl: './teachers.component.html',
  styleUrls: ['./teachers.component.scss'],
})
export class TeachersComponent implements OnInit {
  name: string;
  lastName: string;
  email: string;
  phone: string;
  program: string;
  semester: string;
  id: string = 'ade220cc-72e1-4154-b3b2-8c0dfaaa0bc6';

  constructor(private monitor: MonitorService) {}

  ngOnInit(): void {}

  createMonitor() {
    let bodyRequest: MonitorDTO = {
      note: 0.0,
      name: this.name,
      surname: this.lastName,
      email: this.email,
      phoneNumber: parseInt(this.phone),
      degree: this.program,
      id: this.id,
    };
    this.monitor.createMonitor(bodyRequest).subscribe(
      (resolve) => {
        console.log('creado satisfactoriamente');
      },
      (error) => {
        console.error(error);
      }
    );
  }
}
