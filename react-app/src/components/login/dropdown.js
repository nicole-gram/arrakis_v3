// Dropdown.js
import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const Dropdown = ({ options, onSelect }) => {
  const [selectedOption, setSelectedOption] = useState('');

  const handleChange = (event) => {
    const selectedValue = event.target.value;
    setSelectedOption(selectedValue);
    onSelect(selectedValue);
  };

  const navigate = useNavigate();

  const handleSubmit = async () => {
    // Perform any additional processing or validation you need here.
    // For now, we'll use the navigate function passed from App.js to navigate.
    console.log(selectedOption);

    navigate(`/personal_bonds/${selectedOption}`);
    window.location.reload();
  };

  return (
    <div>
      <select onChange={handleChange}>
        <option value="">Select an option</option>
        {options.map((option) => (
          <option key={option.value} value={option.value}>
            {option.label}
          </option>
        ))}
      </select>
      <button onClick={handleSubmit}>Submit</button>
    </div>
  );
};

export default Dropdown;

