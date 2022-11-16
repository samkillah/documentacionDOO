import { Component, OnInit } from '@angular/core';
import { StudentDTO, StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.scss'],
})
export class StudentsComponent implements OnInit {
  name: string;
  lastName: string;
  email: string;
  phone: string;
  program: string;
  semester: string;
  id: string = 'ade220cc-72e1-4154-b3b2-8c0dfaaa0bc6';

  constructor(private student: StudentService) {}

  ngOnInit(): void {}

  createStudent() {
    let bodyRequest: StudentDTO = {
      degree: this.program,
      id: this.id,
      phoneNumber: parseInt(this.phone),
      surname: this.lastName,
      name: this.name,
      email: this.email,
    };
    this.student.createStudent(bodyRequest).subscribe(
      (resolve) => {
        console.log('creado satisfactoriamente');
      },
      (error) => {
        console.error(error);
      }
    );
  }
}
