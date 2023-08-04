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
                </NavMenu>
            </Nav>
        </>
    );
};
 
export default Navbar;