import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { MenuItem } from '../model/menu-item.model';

@Injectable({providedIn: 'root'})
export class RestaurantService {
  private baseUrl = "http://localhost:8080"
  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/restaurant');
  }

  getRestaurantItems(): Observable<any> {
    return this.http.get<MenuItem[]>(this.baseUrl + '/api/items');
  }
}