import { Component, OnInit } from '@angular/core';
import { Employee } from "../employee";
import { EmployeeService } from "../employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  employees: Employee[];

  constructor(private employeeService: EmployeeService,
              private router : Router) { }

  ngOnInit(): void {

    this.getEmployees();/* this is comes from spring boot */

  }

  getEmployees() {
    this.employeeService.getEmployeeList().subscribe(data =>{
      this.employees = data;
    })
  }

  updateEmp(id: number) {
    this.router.navigate(['updateEmp',id]);
  }

  deleteEmp(id:number){
    this.employeeService.deleteEmp(id).subscribe(data =>{
      console.log(data);
      this.getEmployees();
    })
  }

  viewEmp(id: number) {
    this.router.navigate(['viewEmp',id]);
  }
}
