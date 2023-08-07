import React, { useEffect, useState } from 'react';

const PersonalBonds = () => {
  const [personalBonds, setPersonalBonds] = useState([]);

  useEffect(() => {
    // Retrieve the data from localStorage
    const savedData = JSON.parse(localStorage.getItem('personalBondsData'));
    if (savedData) {
      setPersonalBonds(savedData);
    }
  }, []);

  return (
    <div>
      <h2>Personal Bonds</h2>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Amount</th>
            <th>Maturity Date</th>
          </tr>
        </thead>
        <tbody>
          {personalBonds.map((bond) => (
            <tr key={bond.id}>
              <td>{bond.id}</td>
              <td>{bond.name}</td>
              <td>{bond.amount}</td>
              <td>{bond.maturityDate}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default PersonalBonds;