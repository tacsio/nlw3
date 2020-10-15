import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { FiPlus, FiArrowRight } from "react-icons/fi";
import { Map, TileLayer, Marker, Popup } from "react-leaflet";

import marker from "../images/marker.svg";

import "../styles/pages/orphanage-map.css";
import mapIcon from "../util/mapIcon";
import api from "../services/api";

interface Orphanage {
  id: number;
  latitude: number;
  longitude: number;
  name: string;
}

export default function OrphanagesMap() {
  const [orphanages, setOrphanages] = useState<Orphanage[]>([]);

  useEffect(() => {
    api.get("orphanages").then((response) => {
      const orphanages = response.data;
      setOrphanages(orphanages);
    });
  }, []);

  return (
    <div id="page-map">
      <aside>
        <header>
          <img src={marker} alt="Happy " />
          <h2>Escolha um orfanato no mapa</h2>
          <p>{"Muitas crianças estão esperando a sua visita :)"}</p>
        </header>

        <footer>
          <strong>Recife</strong>
          <span>Pernambuco</span>
        </footer>
      </aside>

      <Map
        center={[-8.0631976, -34.8709216]}
        zoom={21}
        style={{ width: "100%", height: "100%" }}
      >
        {orphanages.map((orphanage) => (
          <Marker
            key={orphanage.id}
            position={[orphanage.latitude, orphanage.longitude]}
            icon={mapIcon}
          >
            <Popup
              className="map-popup"
              closeButton={false}
              minWidth={240}
              maxWidth={240}
            >
              {orphanage.name}
              <Link to={`orphanages/${orphanage.id}`}>
                <FiArrowRight size={20} color="#FFF" />
              </Link>
            </Popup>
          </Marker>
        ))}

        <TileLayer url="https://a.tile.openstreetmap.org/{z}/{x}/{y}.png" />

        {/* <TileLayer
          url={`https://api.mapbox.com/styles/v1/mapbox/light-v10/tiles/256/{z}/{x}/{y}@2x?access_token=${process.env.REACT_APP_MAPBOX_TOKEN}`}
        /> */}
      </Map>

      <Link to="/orphanages/create" className="create-orphanage">
        <FiPlus size={32} color="#fff" />
      </Link>
    </div>
  );
}
