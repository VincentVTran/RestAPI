import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';
import PrimaryPage from './Component/PrimaryPage'
ReactDOM.render(<PrimaryPage />, document.getElementById('root'));
serviceWorker.unregister();
