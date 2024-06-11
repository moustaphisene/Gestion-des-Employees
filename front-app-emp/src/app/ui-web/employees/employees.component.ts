import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrl: './employees.component.css'
})
export class EmployeesComponent implements OnInit{
  public employees: any;
  constructor( private http: HttpClient) {
  }

  ngOnInit() {
    this.http.get("http://localhost:8181/api/employees").subscribe({
      next :value => {

        this.employees = value;

      },
      error : err => {
        console.log("Cannot load employees", err)
      }
      }
    )
  }

}
