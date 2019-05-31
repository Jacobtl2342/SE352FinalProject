import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-customer-landing',
  templateUrl: './customer-landing.component.html',
  styleUrls: ['./customer-landing.component.css']
})
export class CustomerLandingComponent implements OnInit {

  table = [
    {ordernumber : 1, restaurant : "Gibsons", cost : 300, deliverystatus: false},
    {ordernumber : 2, restaurant : "Tavern on Rush", cost : 400, deliverystatus: false},
    {ordernumber : 3, restaurant : "Carmines", cost : 300, deliverystatus: false}   
  ];

  rtable = [
    {restaurantnumber: 1, restaurantname : "Panera"},
    {restaurantnumber: 2, restaurantname : "Shake Shack"},
    {restaurantnumber: 3, restaurantname : "Wing Stop"},
    {restaurantnumber: 4, restaurantname : "Burger King"},
    {restaurantnumber: 5, restaurantname : "Taco Bell"},
    {restaurantnumber: 6, restaurantname : "Pizza Hut"},
    {restaurantnumber: 7, restaurantname : "Five Guys"},
    {restaurantnumber: 8, restaurantname : "Subway"},
    {restaurantnumber: 9, restaurantname : "McDonalds"}
  ];

  constructor() { }
 
  ngOnInit() {
  }

}
