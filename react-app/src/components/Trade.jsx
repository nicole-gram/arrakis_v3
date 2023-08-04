import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Table, TableBody, TableCell, TableContainer, TableHead, TableRow, Paper } from '@mui/material';

const Trade = () => {
  const [trades, setTrades] = useState([]);

  useEffect(() => {
    // Fetch data from the backend API when the component mounts
    fetchTrades();
  }, []);

  const fetchTrades = async () => {
    try {
      const response = await axios.get('http://localhost:8080/trades/{active}');
      setTrades(response.data);
    } catch (error) {
      console.error('Error fetching trades:', error);
    }
  };

  return (
    <TableContainer component={Paper}>
      <Table>
        <TableHead>
          <TableRow>
            <TableCell>Trade ID</TableCell>
            <TableCell>ISIN</TableCell>
            <TableCell>Book Name</TableCell>
            <TableCell>Trade Date</TableCell>
            <TableCell>Settlement Date</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {trades.map((trade) => (
            <TableRow key={trade.id}>
              <TableCell>{trade.id}</TableCell>
              <TableCell>{trade.security.isin}</TableCell>
              <TableCell>{trade.book.name}</TableCell>
              <TableCell>{trade.tradeDate}</TableCell>
              <TableCell>{trade.settlementDate}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
};

export default Trade;
