import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PlacesService {
  constructor(private http: HttpClient) {}
  createPlace(bodyRequest: PlaceDTO): Observable<any> {
    return this.http.post('/api/place', bodyRequest);
  }
}

export interface PlaceDTO {
  id: string;
  block: string;
  classRoom: string;
}
