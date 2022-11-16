import { Component, OnInit } from '@angular/core';
import { PlaceDTO, PlacesService } from 'src/app/services/places.service';

@Component({
  selector: 'app-places',
  templateUrl: './places.component.html',
  styleUrls: ['./places.component.scss'],
})
export class PlacesComponent implements OnInit {
  block: string;
  classRoom: string;
  id: string = 'ade220cc-72e1-4154-b3b2-8c0dfaaa0bc6';

  constructor(private places: PlacesService) {}

  ngOnInit(): void {}

  createPlace() {
    let bodyRequest: PlaceDTO = {
      block: this.block,
      classRoom: this.classRoom,
      id: this.id,
    };
    this.places.createPlace(bodyRequest).subscribe(
      (resolve) => {
        console.log('creado satisfactoriamente');
      },
      (error) => {
        console.error(error);
      }
    );
  }
}
