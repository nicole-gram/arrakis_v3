import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';

const PersonalBonds = () => {
  const [personalBonds, setPersonalBonds] = useState([]);
  const { selectedUserId } = useParams();

  useEffect(() => {
    const fetchData = async () => {
      try {
        // Fetch the user data based on the selected user's ID (selected option)
        const response = await axios.post(`http://localhost:8080/trades/get-book-of-trades?clientId=${selectedUserId}`);
        setPersonalBonds(response.data); // Update the personalBonds state with the fetched data
        console.log("Response: ", response.data);
      } catch (err) {
        console.log('Error:', err);
      }
    };
    fetchData();
  }, [selectedUserId]);

  return (
    <div>
      <TableContainer component={Paper}>
        <Table aria-label="personal bonds table">
          <TableHead>
            <TableRow>
              <TableCell>Trading Book</TableCell>
              <TableCell>Counterparty Name</TableCell>
              <TableCell>ISIN</TableCell>
              <TableCell>CUSIP</TableCell>
              <TableCell>Maturity Date</TableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {personalBonds.map((bond) => (
              <TableRow key={bond.id}>
                <TableCell>{bond.book.name}</TableCell>
                <TableCell>{bond.counterparty.name}</TableCell>
                <TableCell>{bond.security.isin}</TableCell>
                <TableCell>{bond.security.cusip}</TableCell>
                <TableCell>{bond.security.maturityDate}</TableCell>
              </TableRow>
            ))}
          </TableBody>
        </Table>
      </TableContainer>
    </div>
  );
};

export default PersonalBonds;
