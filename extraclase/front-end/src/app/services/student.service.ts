import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class StudentService {
  constructor(private http: HttpClient) {}

  createStudent(bodyRequest: StudentDTO): Observable<any> {
    return this.http.post('/api/student', bodyRequest);
  }
}

export interface StudentDTO {
  id: string;
  name: string;
  surname: string;
  email: string;
  phoneNumber: number;
  degree: string;
}
