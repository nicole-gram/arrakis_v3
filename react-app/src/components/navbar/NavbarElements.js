import { FaBars } from "react-icons/fa";
import { NavLink as Link } from "react-router-dom";
import styled from "styled-components";

// Primary color for the blue color scheme
const primaryBlue = "#4d4dff";

export const Nav = styled.nav`
  background: ${primaryBlue};
  height: 85px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0.2rem calc((100vw - 1000px) / 2);
  z-index: 12;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
`;

export const NavLink = styled(Link)`
  color: #fff; /* White color for the links */
  display: flex;
  align-items: center;
  text-decoration: none;
  padding: 0 1rem;
  height: 100%;
  cursor: pointer;
  transition: color 0.2s ease-in-out; /* Add a smooth color transition on hover */
  font-size: 16px;
  &:hover {
    color: #f0f0f0; /* Lighter shade of white on hover */
  }
  &.active {
    color: #f0f0f0; /* Lighter shade of white for active link */
    font-weight: bold;
  }
`;

export const Bars = styled(FaBars)`
  display: none;
  color: #fff; /* White color for the burger icon */
  @media screen and (max-width: 768px) {
    display: block;
    position: absolute;
    top: 0;
    right: 0;
    transform: translate(-100%, 75%);
    font-size: 1.8rem;
    cursor: pointer;
  }
`;

export const NavMenu = styled.div`
  display: flex;
  align-items: center;
  margin-right: -24px;
  @media screen and (max-width: 768px) {
    display: none;
  }
`;

// Optionally, you can add more styles for the links in the NavMenu on larger screens
export const NavMenuItem = styled(NavLink)`
  margin-right: 24px;
  &:last-child {
    margin-right: 0;
  }
`;
