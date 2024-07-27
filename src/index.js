import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import EmployeeList from './components/EmployeeList';
import AddEmployee from './components/AddEmployee';
import EmployeeService from './Service/EmployeeService';
import Navbar from './components/Navbar';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
    <AddEmployee/>
    <EmployeeList />
    <EmployeeService/>
    <Navbar/>
    <UpdateEmployee/>

    
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
