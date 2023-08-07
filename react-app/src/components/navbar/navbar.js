import React from "react";
import { Nav, NavLink, NavMenu }
    from "./NavbarElements";
 
const Navbar = () => {
    return (
        <>
            <Nav>
                <NavMenu>
                    <NavLink to="/active_bonds" activeStyle>
                        Active Bonds
                    </NavLink>
                    <NavLink to="/my_bonds" activeStyle>
                        My Bonds
                    </NavLink>
                    <NavLink to="/bondDetails" activeStyle>
                        Bond Details
                    </NavLink>
                </NavMenu>
            </Nav>
        </>
    );
};
 
export default Navbar;