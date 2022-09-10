import logo from '../../assets/img/Logo.svg';
import './styles.css';
function Header() {
    return (
        <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMEta"/>
            <h1>DSMeta</h1>
            <p>Desenvolvido por:
                <a href="https://github.com/Raoned">https://github.com/Raoned</a>

            </p>
        </div>

    </header>
    )
  }
  
  export default Header
  