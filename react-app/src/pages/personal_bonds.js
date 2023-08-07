// Bond.js
import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';
import PersonalBonds from '../components/trade/PersonalBonds';

const PersonalBond = () => {
  const { selectedUserId } = useParams();
  const [selectedUser, setSelectedUser] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        // Fetch the user data based on the selected user's ID (selected option)
        const response = await axios.post(`http://localhost:8080/trades/get-book-of-trades?clientId=${selectedUserId}`);
        setSelectedUser(response.data);
        console.log("Response: " + selectedUserId);
        console.log(response);
      } catch (err) {
        console.log('Error:', err);
      }
    };
    fetchData();
  }, [selectedUserId]);

  return (
    <div>
      <h1>Personal Bonds</h1>
      <p> fetches user response info </p>
      <PersonalBonds/>
    </div>
  );
};

export default PersonalBond;
