// SelectUser.js
import React, { useState } from 'react';
import Dropdown from '../components/login/dropdown';

const SelectUser = () => {
  // Sample list of users
  const users = [
    { id: 1, name: 'iboyles' },
    { id: 2, name: 'neelkanth' },
    { id: 3, name: 'bob' },
    { id: 4, name: 'nicole' },
    { id: 5, name: 'richard' },
    { id: 6, name: 'ben' }
    // Add more users as needed
  ];

  const [selectedUser, setSelectedUser] = useState(null);

  const handleUserSelection = (selectedUserId) => {
    // Find the selected user object from the list
    const user = users.find((user) => user.id === selectedUserId);
    setSelectedUser(user);
  };

  return (
    <div>
    <h1> Select User </h1>
      <Dropdown
        options={users.map((user) => ({ value: user.id, label: user.name }))}
        onSelect={handleUserSelection}
      />
      {selectedUser && <p>Selected User: {selectedUser.name}</p>}
    </div>
  );
};

export default SelectUser;
