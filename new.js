var employees = [];
var hourlyPay = [];
var hoursWorked = [];
var weeklyPay = [];
var companyAveragePay = 0;

for (var i = 0; i < 5; i++) {
    employees.push(prompt("Enter employee's last name: "));
    hourlyPay.push(prompt("Enter employee's hourly pay: "));
    hoursWorked.push(prompt("Enter employee's hours worked: "));
    weeklyPay.push(hourlyPay[i] * hoursWorked[i]);
    companyAveragePay = companyAveragePay + weeklyPay[i];
}

companyAveragePay = companyAveragePay / 5;

for (var i = 0; i < 5; i++) {
    console.log("Employee: " + employees[i] + ", weekly pay: " + weeklyPay[i]);
}

console.log("Company average pay: " + companyAveragePay);