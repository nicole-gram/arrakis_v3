import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Table, TableBody, TableCell, TableContainer, TableHead, TableRow, Paper } from '@mui/material';

const Bond = () => {
  const [trades, setTrades] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/trades/within-five-days-behind')
      .then((response) => {
        setTrades(response.data);
        fetchMoreData();
        console.log(response.data)
      })
      .catch((error) => {
        console.error('Error fetching trades:', error);
      });
  }, []);

  const fetchMoreData = () => {
    console.log("hi")
    axios.get('http://localhost:8080/trades/within-five-days')
      .then((response) => {
        // Append the new data to the existing trades array
        setTrades((prevTrades) => [...prevTrades, ...response.data]);
      })
      .catch((error) => {
        console.error('Error fetching more trades:', error);
      });
  };
  

  return (
    <TableContainer component={Paper}>
      <Table>
        <TableHead>
          <TableRow>
            <TableCell>Counterparty Name</TableCell>
            <TableCell>Book Name</TableCell>
            <TableCell>Maturity Date</TableCell>
            <TableCell>Currency</TableCell>
            <TableCell>ISIN</TableCell>
            
          </TableRow>
        </TableHead>
        <TableBody>
          {trades.map((trade) => (
            <TableRow key={trade.id}>
              <TableCell>{trade.counterparty.name}</TableCell>
              <TableCell>{trade.book.name}</TableCell>
              <TableCell>
                <strong>{new Date(trade.security.maturityDate).toDateString()}</strong>
              </TableCell>
              <TableCell>{trade.currency}</TableCell>
              <TableCell>{trade.security.isin}</TableCell>
              
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
};

export default Bond;