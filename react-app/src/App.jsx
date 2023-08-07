import React from "react";
import ActiveBonds from "./pages/active_bonds";
import MyBonds from "./pages/my_bonds";
import Navbar from "./components/navbar/navbar";

import { BrowserRouter as Router, Routes, Route }
    from 'react-router-dom';
import Bond from "./pages/bondDetails";
import SelectUser from "./pages/select_user";
import PersonalBond from "./pages/personalbonds";

const App = () => {
  return (
    <Router>
        <Navbar />
        <Routes>
            <Route exact path='/' element={<SelectUser />} />
            <Route path='/active_bonds' element={<ActiveBonds />} />
            <Route path='/bondDetails' element={<Bond/>}/>
            <Route path='/my_bonds' element={<MyBonds />} />
            <Route path='/personal_bonds' element={<PersonalBond />} />
        </Routes>
    </Router>
);
};

export default App;
