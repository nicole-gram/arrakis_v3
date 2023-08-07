import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Navbar from "../../components/navbar/navbar";
import ActiveBonds from "../../pages/active_bonds";
import MyBonds from "../../pages/my_bonds";
import Bond from "../../pages/bondDetails";


const AppWithNavbar = () => {
  return (
    <Router>
      <Navbar />
      <Routes>
        <Route path="/active_bonds" element={<ActiveBonds />} />
        <Route path="/bondDetails" element={<Bond />} />
        <Route path="/my_bonds" element={<MyBonds />} />
      </Routes>
    </Router>
  );
};

export default AppWithNavbar;
