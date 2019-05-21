import { Component, OnInit } from '@angular/core';

export interface userTypes {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  types: userTypes[] = [
    {value: 'customer-0',      viewValue: 'Customer'},
    {value: 'driver-1'  ,      viewValue: 'Driver'},
    {value: 'restaurant-2', viewValue: 'Restaurant'}
  ];
}
