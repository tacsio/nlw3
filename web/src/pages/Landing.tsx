import React from "react";
import { Link } from "react-router-dom";
import { FiArrowRight } from "react-icons/fi";

import "../styles/pages/landing.css";

import logoImg from "../images/logo.svg";

export default function Landing() {
  return (
    <div id="page-landing">
      <div className="content-wrapper">
        <img src={logoImg} alt="Happy" />

        <main>
          <h1>Leve fecilidade para o mundo</h1>
          <p>Visite orfanatos e mude o dia de muitas crianças.</p>
        </main>

        <div className="location">
          <strong>Recife</strong>
          <span>Pernambuco</span>
        </div>

        <Link to="/app" className="enter-app">
          <FiArrowRight size={28} strokeWidth={3} color="#8D734B" />
        </Link>
      </div>
    </div>
  );
}
