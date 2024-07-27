
import './App.css';
import{BrowserRouter,Routes,Route} from "react-router-dom";
import AddEmployee from './components/AddEmployee';
import UpdateEmployee from './components/AddEmployee';
import Navbar from './components/Navbar';
import EmployeeList from './components/EmployeeList';


function App() {
  return (
    <>
  <BrowserRouter>

<Navbar/>

<Routes>
  <Route index  element={<EmployeeList/>}/>
  <Route path="/"  element={<EmployeeList/>}/>
  <Route path="/addEmployee"  element={<AddEmployee/>}/>
  <Route path='/editEmployee/:id' element={<UpdateEmployee/>}/>
</Routes>

</BrowserRouter>
    
    </>//fragments
   
  );
}

export default App;
// export default Navbar;
// export default AddEmployee;
// export default EmployeeList;
