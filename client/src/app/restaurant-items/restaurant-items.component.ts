import { Component, OnInit } from '@angular/core';
import { MenuItem } from '../shared/model/menu-item.model';
import { RestaurantService } from '../shared/restaurant/restaurant.service';

@Component({
  selector: 'app-restaurant-items',
  templateUrl: './restaurant-items.component.html',
  styleUrls: ['./restaurant-items.component.css']
})
export class RestaurantItemsComponent implements OnInit {
  items: MenuItem[];
  constructor(private restaurantService: RestaurantService) { 
    this.items = [
      /*{id:1, name:'Burger', description: 'Spicy Burger', imagePath:'https://www.seriouseats.com/recipes/images/2015/07/20150702-sous-vide-hamburger-anova-primary-1500x1125.jpg'},
      {id:2, name:'Coleslaw', description: 'Cabbage, Carrot, Nando&amp;#039;s Special Mayonnaise', imagePath:'assets/images/Coleslaw.jpg'},
      {id:3, name:'Grilled Veg', description: 'Grilled Assorted Vegetables', imagePath:'assets/images/Grilled Veg.jpg'},
      {id:2, name:'Garlic Bread', description: 'Toasted Garlic Flavored Bread', imagePath:'https://s3.ap-south-1.amazonaws.com/mumbai.urbanpiper.com/media/bizmedia/2018/11/12/veg-cheese-garlic-bread_COMPRESSED.jpg'},
      */
    ]
  }


  ngOnInit() {
    this.restaurantService.getRestaurantItems().subscribe(
      res => this.items = res
    );
  }

}

