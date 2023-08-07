import React, { useEffect, useState } from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Navbar from "./components/navbar/navbar";
import ActiveBonds from "./pages/active_bonds";
import PersonalBonds from "./pages/personal_bonds";
import Bond from "./pages/bondDetails";
import SelectUser from "./pages/select_user";
import MyBonds from "./pages/my_bonds";

const App = () => {
  const [isHomePage, setIsHomePage] = useState(true);

  useEffect(() => {
    setIsHomePage(window.location.pathname === '/');
  }, []);

  return (
    <Router>
      {isHomePage ? null : <Navbar />}
      <Routes>
            <Route exact path='/' element={<SelectUser />} />
            <Route path='/active_bonds' element={<ActiveBonds />} />
            <Route path='/bondDetails' element={<Bond/>}/>
            <Route path='/my_bonds' element={<MyBonds />} />
            <Route path="/personal_bonds/:selectedUserId" element={<PersonalBonds />} />
        </Routes>
    </Router>
  );
};

export default App;
