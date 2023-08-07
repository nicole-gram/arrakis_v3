import React from 'react';
import Bond from '../components/trade/Bond'; 
const MyBonds = () => {
    return (
        <div>
            <h1>Bonds due for maturity within last 5 and next 5 days.</h1>
            <Bond/>
        </div>
    );
};
 
export default MyBonds;