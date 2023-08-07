// Bond.js
import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';

const Bond = () => {
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
      <h1>Bond Details Page</h1>
      {selectedUser && (
        <>
          <p>Selected User ID: {selectedUser.id}</p>
          <p>Selected User Name: {selectedUser.name}</p>
          {/* Display other details of the selected user */}
        </>
      )}
    </div>
  );
};

export default Bond;
