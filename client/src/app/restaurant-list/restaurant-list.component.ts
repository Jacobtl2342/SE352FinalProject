import { Component, OnInit } from '@angular/core';
import { RestaurantService } from '../shared/restaurant/restaurant.service';

@Component({
  selector: 'app-restaurant-list',
  templateUrl: './restaurant-list.component.html',
  styleUrls: ['./restaurant-list.component.css']
})
export class RestaurantListComponent implements OnInit {
  restaurants: Array<any>;

  constructor(private carService: RestaurantService) { }

  ngOnInit() {
    this.carService.getAll().subscribe(data => {
      this.restaurants = data;
    });
  }
}