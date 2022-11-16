import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class MonitorService {
  constructor(private http: HttpClient) {}

  createMonitor(bodyRequest: MonitorDTO): Observable<any> {
    return this.http.post('/api/monitor', bodyRequest);
  }
}

export interface MonitorDTO {
  id: string;
  name: string;
  surname: string;
  email: string;
  phoneNumber: number;
  degree: string;
  note: number;
}
