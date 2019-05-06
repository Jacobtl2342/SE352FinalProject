import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
//components
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { CustomerLandingComponent } from './customer-landing/customer-landing.component';
import { DriverLandingComponent } from './driver-landing/driver-landing.component';
import { RestAdminLandingComponent } from './rest-admin-landing/rest-admin-landing.component';

const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'customer', component: CustomerLandingComponent },
  { path: 'driver', component: DriverLandingComponent },
  { path: 'rest-admin', component: RestAdminLandingComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
