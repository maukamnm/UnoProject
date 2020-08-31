import React, { useState, Component } from 'react'; //default component
import Container from 'react-bootstrap/Container';
import Button from 'react-bootstrap/Button';
import './App.css';
import Hands from './ShowHand'; //change name to Hand
import TopCard from './TopCard';
import { CarouselItem, Row, Col } from 'react-bootstrap';
import translateCard from './translateCard';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { initial: true, data: { topCard: "" } }
  };

  componentDidMount() {
    const unoUrl = "http://localhost:8080/games";
    // a promise chain
    fetch(unoUrl)
      .then(data => {
        let d = data.json();
        console.log(d);
        return d;
      })
      .then(data => {
        console.log(data);
        //this.setState({ data })
      });
  }

  turn = () => {
    const unoUrl = "http://localhost:8080/games";
    fetch(unoUrl, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ "gameName": "Test1" })
    })
      .then(data => {
        let d = data.json();
        console.log(d);

        return d;

      })

      .then(data => {

        console.log("Total data: ", data);
        this.setState({ initial: false, data }) //changed the state of component
      });
  }

  render() {
    console.log("This states data", this.state.data);
    return (
      <div id="body">
        <Container fluid="xs">
          <Row className="justify-content-md-center">
            <Col xs={8} md={4}>
              <img src={process.env.PUBLIC_URL + '/small_cards/uno_background.jpg'} alt='back' id="headIMG" className="img-fluid" />
            </Col>
          </Row>
          <Row className="justify-content-md-center">
            <Col xs={8} md={4}>
              <h1>Harry Potter Uno Game!</h1>
            </Col>
          </Row>
          <Row className="justify-content-md-center">
            <Col xs={8} md={4}>
              <Hands
                hand={this.state.initial ? {} : this.state.data.hands[0]}
                initial={this.state.initial} name="Harry" //Could this.state.data.card need to be hand.card?
                card={this.state.initial ? {} : this.state.data.i === 0 ? this.state.data.card : null}></Hands>
            </Col>
            <Col xs={8} md={4}>
              <Hands
                hand={this.state.initial ? {} : this.state.data.hands[1]}
                initial={this.state.initial} name="Ginny"
                card={this.state.initial ? {} : this.state.data.i === 1 ? this.state.data.card : null}></Hands>
            </Col>
          </Row>
          <Row className="justify-content-md-center">
            {/* TopCard  */}
            <TopCard topCard={Object.assign({}, this.state.data.topCard)}
              initial={this.state.initial}></TopCard>
          </Row>
          <Row className="justify-content-md-center">
            <Button variant="danger" onClick={this.turn} size="lg" >Turn</Button>{' '}
          </Row>
          <Row className="justify-content-md-center">
            <Col xs={8} md={4}>
              <Hands
                hand={this.state.initial ? {} : this.state.data.hands[2]}
                initial={this.state.initial} name="Hermoine"
                card={this.state.initial ? {} : this.state.data.i === 2 ? this.state.data.card : null}></Hands>

            </Col>
            <Col xs={8} md={4}>
              <Hands
                hand={this.state.initial ? {} : this.state.data.hands[3]}
                initial={this.state.initial} name="Ron"
                card={this.state.initial ? {} : this.state.data.i === 3 ? this.state.data.card : null}></Hands>
            </Col>
          </Row>
          <Row>
            <Col>
            <h5>Made by: Mara M. Munoz</h5>
          </Col>
          </Row>
        </Container>
  
      </div>); 
  }
}

export default App;