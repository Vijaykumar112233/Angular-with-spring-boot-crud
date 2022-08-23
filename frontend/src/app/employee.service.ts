import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Employee} from "./employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseurl = "http://localhost:8080/angular";

  constructor(private httpClient: HttpClient) { }

  getEmployeeList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.baseurl}`);
  }

  createEmp(employee:Employee):Observable<Object>{
    return this.httpClient.post(`${this.baseurl}`,employee);
  }

  getEmployeeById(id:number):Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseurl}/${id}`);
  }

  updateEmployee(id:number,employee:Employee):Observable<Object>{
    return this.httpClient.put(`${this.baseurl}/${id}`,employee);
  }

  deleteEmp(id:number):Observable<Object>{
    return this.httpClient.delete(`${this.baseurl}/${id}`);
  }
}
