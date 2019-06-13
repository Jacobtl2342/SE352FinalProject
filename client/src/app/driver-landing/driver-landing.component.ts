import { Component, OnInit } from '@angular/core';

export interface avaliableOrders {
  restaurantName: string;
  orderNumber: number;
  orderValue: number;
}

const ELEMENT_DATA: avaliableOrders[] = [
  {orderNumber: 1, restaurantName: 'Panera', orderValue:25},
  {orderNumber: 2, restaurantName: 'Shake Shack', orderValue: 35},
  {orderNumber: 3, restaurantName: 'Wing Stop', orderValue: 32},
  {orderNumber: 4, restaurantName: 'Burger King', orderValue: 55},
  {orderNumber: 5, restaurantName: 'Taco Bell', orderValue: 47}
];

@Component({
  selector: 'app-driver-landing',
  templateUrl: './driver-landing.component.html',
  styleUrls: ['./driver-landing.component.css']
})
export class DriverLandingComponent implements OnInit {

  constructor() { }
  displayedColumns: string[] = ['orderNumber', 'restaurantName', 'orderValue'];
  dataSource = ELEMENT_DATA;
  ngOnInit() {
  }

}
