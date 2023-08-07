import React, { useEffect, useState } from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Navbar from "./components/navbar/navbar";
import ActiveBonds from "./pages/active_bonds";
import MyBonds from "./pages/my_bonds";
import Bond from "./pages/bondDetails";
import SelectUser from "./pages/select_user";

const Home = () => {
  const [isHomePage, setIsHomePage] = useState(true);

  useEffect(() => {
    setIsHomePage(window.location.pathname === '/');
  }, []);

  return (
    <Router>
      {isHomePage ? null : <Navbar />}
      <Routes>
        <Route path="/" element={<SelectUser />} />
        <Route path="/active_bonds" element={<ActiveBonds />} />
        <Route path="/bondDetails" element={<Bond />} />
        <Route path="/my_bonds" element={<MyBonds />} />
      </Routes>
    </Router>
  );
};

export default Home;
