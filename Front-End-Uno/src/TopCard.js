import React, { Component } from 'react'; //default component
import cardInfo from './card-info';
import ShowCard from './ShowCard';
import './topcard.css';
import translateCard from './translateCard';

class TopCard extends Component {

    render() {
        console.log(this.props.topCard);
        let { color, value } = this.props.topCard;
        // console.log('value=', typeof value, 'color=', typeof color);
        // if (this.props.initial !== true) {
        //     console.log(translateCard(this.props.topCard.color, this.props.topCard.value));
        // }
        let set = [];
        let num = this.props.initial ? 1 : Math.floor(Math.random()) + 1; //conditional operater

        for (let i = 0; i < num; i++) {
  //         let randNum = this.props.initial ? 0 : Math.floor(Math.random() * 53);
            set.push(
                <ShowCard className="card" initial={this.props.initial} card={this.props.topCard}></ShowCard>
            )
        }

        return (
            <div>
                <h1> TopCard</h1>
                <div id="top">
                    {set}
                </div>

            </div>
        ); //Display fixed card in showcard inside container in Showcard tag with img tag
    }
}
export default TopCard;