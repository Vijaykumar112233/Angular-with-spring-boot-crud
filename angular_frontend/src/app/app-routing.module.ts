import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {EmployeeComponent} from "./employee/employee.component";
import {CreateEmpComponent} from "./create-emp/create-emp.component";
import {UpdateComponent} from "./update/update.component";
import {DetailsComponent} from "./details/details.component";

const routes: Routes = [
  {path:'employees',component:EmployeeComponent},
  {path:'createEmp',component:CreateEmpComponent},
  {path:'',redirectTo:'employees',pathMatch:'full'},
  {path:'updateEmp/:id',component:UpdateComponent},
  {path:'viewEmp/:id',component:DetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
