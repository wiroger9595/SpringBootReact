import React, { Component } from 'react';
import './App.css';
import Dashboard from "./components/Dashboard";
import Header from './components/Layout/Header';
import "bootstrap/dist/css/bootstrap.min.css"
import {BrowserRouter as Router, Route} from "react-router-dom";
import AddProject from './components/Project/AddProject';


class App extends Component {
  render() {
    return (
      <Router>
        <Route>
          <div className="App">
            <Header />
              <Route exact path="/dashboard" component={Dashboard} />

              <Route exact path="/addProejct" component={AddProject} />
            </div>
          </Route>
        </Router>
    );
  };
}

export default App;
