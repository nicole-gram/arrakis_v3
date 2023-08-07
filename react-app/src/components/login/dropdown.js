// Dropdown.js
import React, { useState } from 'react';
import axios from 'axios';

const Dropdown = ({ options, onSelect, navigate }) => {
  const [selectedOption, setSelectedOption] = useState('');
  

  const handleChange = (event) => {
    const selectedValue = event.target.value;
    setSelectedOption(selectedValue);
    onSelect(selectedValue);
  };

  const handleSubmit = async () => {
    // Perform any additional processing or validation you need here.
    // For now, we'll use the navigate function passed from App.js to navigate.
    console.log(selectedOption);
    
    try {
      const response = await axios.post(
        "http://localhost:8080/trades/get-book-of-trades?clientId=" + selectedOption,
        selectedOption
      );
    
      // You can now access the response data from the 'response' variable
      console.log("Response: ", response.data);
    
      // You can also save the response data to localStorage if needed
      localStorage.setItem('responseFromServer', JSON.stringify(response.data));
    
      // Perform any other actions with the response data here
    
    } catch (err) {
      console.log("Error: ", err);
    }
    
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
