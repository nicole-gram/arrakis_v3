import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import SelectUser from "../../pages/select_user";

const AppWithoutNavbar = () => {
  return (
    <Router>
      <Routes>
        <Route exact path="/" element={<SelectUser />} />
      </Routes>
    </Router>
  );
};

export default AppWithoutNavbar;
